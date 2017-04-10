'use strict';

var url = require('url');

var Main = require('./MainService');

module.exports.rootGET = function rootGET (req, res, next) {
  Main.rootGET(req.swagger.params, res, next);
};
