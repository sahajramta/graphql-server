type Query {
currentTime: String
numbersInRange(begin: Int!, end: Int!): NumbersInRange
taskMainList: [Task!]
}

"""Aggregate info on a range of numbers"""
type NumbersInRange {
sum: Int!
count: Int!
}

type Task {
id: ID!
content: String!
tags: [String!]!
approachCount: Int!
createdAt: String!
author: User!
approachList: [Approach!]!
}

type User {
id: ID!
username: String
name: String!
}

type Approach {
id: ID!
content: String!
voteCount: Int!
createdAt: String!
author: User!
}