'use strict';

var url = require('url');

var User = require('./UserService');

module.exports.userEntrollDeletePOST = function userEntrollDeletePOST (req, res, next) {
  User.userEntrollDeletePOST(req.swagger.params, res, next);
};

module.exports.userEntrollPOST = function userEntrollPOST (req, res, next) {
  User.userEntrollPOST(req.swagger.params, res, next);
};

module.exports.userMeGET = function userMeGET (req, res, next) {
  User.userMeGET(req.swagger.params, res, next);
};
