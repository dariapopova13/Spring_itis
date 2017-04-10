'use strict';

exports.userEntrollDeletePOST = function(args, res, next) {
  /**
   * delete record to the doctor
   *
   * scheduleId Long 
   * returns User
   **/
  var examples = {};
  examples['application/json'] = {
  "schedule" : [ {
    "roomNumber" : "aeiou",
    "week" : "{}",
    "isFree" : 123,
    "doctorId" : 123456789,
    "from" : "aeiou",
    "id" : 123456789,
    "to" : "aeiou"
  } ],
  "password" : "aeiou",
  "role" : "{}",
  "surname" : "aeiou",
  "name" : "aeiou",
  "id" : 123456789,
  "username" : "aeiou"
};
  if (Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  } else {
    res.end();
  }
}

exports.userEntrollPOST = function(args, res, next) {
  /**
   * Entroll to doctor
   *
   * scheduleId Long 
   * returns User
   **/
  var examples = {};
  examples['application/json'] = {
  "schedule" : [ {
    "roomNumber" : "aeiou",
    "week" : "{}",
    "isFree" : 123,
    "doctorId" : 123456789,
    "from" : "aeiou",
    "id" : 123456789,
    "to" : "aeiou"
  } ],
  "password" : "aeiou",
  "role" : "{}",
  "surname" : "aeiou",
  "name" : "aeiou",
  "id" : 123456789,
  "username" : "aeiou"
};
  if (Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  } else {
    res.end();
  }
}

exports.userMeGET = function(args, res, next) {
  /**
   * User page
   *
   * returns User
   **/
  var examples = {};
  examples['application/json'] = {
  "schedule" : [ {
    "roomNumber" : "aeiou",
    "week" : "{}",
    "isFree" : 123,
    "doctorId" : 123456789,
    "from" : "aeiou",
    "id" : 123456789,
    "to" : "aeiou"
  } ],
  "password" : "aeiou",
  "role" : "{}",
  "surname" : "aeiou",
  "name" : "aeiou",
  "id" : 123456789,
  "username" : "aeiou"
};
  if (Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  } else {
    res.end();
  }
}

