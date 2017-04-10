'use strict';

exports.actionDoctorGET = function(args, res, next) {
  /**
   *
   * returns List
   **/
  var examples = {};
  examples['application/json'] = [ {
  "doctors" : [ {
    "photoUrl" : "aeiou",
    "specialty" : 123456789,
    "patronymic" : "aeiou",
    "surname" : "aeiou",
    "schedules" : "{}",
    "name" : "aeiou",
    "middleName" : "aeiou",
    "id" : 123456789
  } ],
  "name" : "aeiou",
  "id" : 123456789
} ];
  if (Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  } else {
    res.end();
  }
}

exports.actionDoctorIdGET = function(args, res, next) {
  /**
   * Specific doctor
   *
   * id Long 
   * no response value expected for this operation
   **/
  res.end();
}

