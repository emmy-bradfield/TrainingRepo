"use strict";

class GenericError extends Error {
    constructor(msg) {
        super();
        this.message = msg;
    }

    getStatusCode() {
        if (this instanceof NotFound) {
            return 404;
        }
        return 500;
    }
}

class NotFound extends GenericError { };

module.exports = {GenericError, NotFound};