INSERT INTO users(first_name,last_name,username,hashed_password) VALUES('Asheesh','Chauhan','test','asdasd233as');

INSERT INTO tasks (content,tags,user_id,approach_count,is_private)
VALUES
('Make an image in HTML change based on the theme color mode (dark or light)',E'code,html',1,1,FALSE),
('Get rid of only the unstaged changes since the last git commit',E'command,git',1,1,FALSE),
('The syntax for a switch statement (AKA case statement) in JavaScript',E'code,javascript',1,2,FALSE),
('Calculate the sum of numbers in a JavaScript array',E'code,javascript',1,1,FALSE),
('Babel configuration file for "react" and "env" presets',E'config,javascript,node',1,1,TRUE),
('Create a secure one-way hash for a text value (like a password) in Node',E'code,node',1,1,FALSE);

INSERT INTO approaches (content,user_id,task_id,vote_count)
VALUES
('<picture>\n  <source\n    srcset="settings-dark.png"\n    media="(prefers-color-scheme: dark)"\n  />\n  <source\n    srcset="settings-light.png"\n    media="(prefers-color-scheme: light), (prefers-color-scheme: no-preference)"\n  />\n  <img src="settings-light.png" loading="lazy" />\n</picture>',1,1,0),
('git diff | git apply --reverse',1,2,0),
('switch (expression) {\n  case value1:\n    // do something when expression === value1\n    break;\n  case value2:\n    // do something when expression === value2\n    break;\n  default:\n    // do something when expression does not equal any of the values above\n}',1,3,5),
('function doSomethingFor(expression) {\n  switch (expression) {\n    case value1:\n      // do something when expression === value1\n      return;\n    case value2:\n      // do something when expression === value2\n      return;\n    default:\n      // do something when expression does not equal any of the values above\n  }\n}',1,3,18),
('arrayOfNumbers.reduce((acc, curr) => acc + curr, 0)',1,4,0);
