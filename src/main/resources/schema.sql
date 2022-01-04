CREATE TABLE users (
  id INT(11) auto_increment,
  username varchar2(100) NOT NULL UNIQUE,
  hashed_password varchar2(100) NOT NULL,
  first_name varchar2(50),
  last_name varchar2(50),
  hashed_auth_token varchar2(100),
  created_at timestamp DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
);

CREATE TABLE tasks (
  id INT(11) auto_increment,
  content varchar2(100) NOT NULL,
  tags varchar2(100),
  user_id INT NOT NULL,
  is_private boolean NOT NULL DEFAULT FALSE,
  approach_count INT NOT NULL DEFAULT 0,
  created_at timestamp DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  FOREIGN KEY (user_id) REFERENCES users
);

CREATE TABLE approaches (
  id INT(11) auto_increment,
  content varchar2(2000) NOT NULL,
  user_id INT(11) NOT NULL,
  task_id INT(11) NOT NULL,
  vote_count INT NOT NULL DEFAULT 0,
  created_at timestamp DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  FOREIGN KEY (user_id) REFERENCES users,
  FOREIGN KEY (task_id) REFERENCES tasks
);