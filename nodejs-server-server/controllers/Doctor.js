'use strict';

var url = require('url');

var Doctor = require('./DoctorService');

module.exports.actionDoctorGET = function actionDoctorGET (req, res, next) {
  Doctor.actionDoctorGET(req.swagger.params, res, next);
};

module.exports.actionDoctorIdGET = function actionDoctorIdGET (req, res, next) {
  Doctor.actionDoctorIdGET(req.swagger.params, res, next);
};
