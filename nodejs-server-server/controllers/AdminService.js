'use strict';

exports.adminDoctorPOST = function(args, res, next) {
  /**
   * Save or update doctor
   *
   * doctor Doctor doctor. 
   * returns Doctor
   **/
  var examples = {};
  examples['application/json'] = {
  "photoUrl" : "aeiou",
  "specialty" : 123456789,
  "patronymic" : "aeiou",
  "surname" : "aeiou",
  "schedules" : "{}",
  "name" : "aeiou",
  "middleName" : "aeiou",
  "id" : 123456789
};
  if (Object.keys(examples).length > 0) {
    res.setHeader('Content-Type', 'application/json');
    res.end(JSON.stringify(examples[Object.keys(examples)[0]] || {}, null, 2));
  } else {
    res.end();
  }
}

