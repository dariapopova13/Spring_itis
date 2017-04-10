'use strict';

var url = require('url');

var Admin = require('./AdminService');

module.exports.adminDoctorPOST = function adminDoctorPOST (req, res, next) {
  Admin.adminDoctorPOST(req.swagger.params, res, next);
};
