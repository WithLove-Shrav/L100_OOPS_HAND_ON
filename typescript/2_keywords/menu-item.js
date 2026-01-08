"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
Object.defineProperty(exports, "__esModule", { value: true });
// menu-item.ts
var MenuItem = /** @class */ (function () {
    function MenuItem(name) {
        this.name = name;
        this.basePrice = 2.0; // constant-like
    }
    MenuItem.prototype.display = function () {
        console.log("".concat(this.name, " - $").concat(this.getPrice())); // 'this'
    };
    return MenuItem;
}());
var Pastry = /** @class */ (function (_super) {
    __extends(Pastry, _super);
    function Pastry(name, type) {
        var _this = _super.call(this, name) || this; // super ctor
        _this.type = type;
        return _this;
    }
    Pastry.prototype.getPrice = function () {
        return this.basePrice + 2.5;
    };
    return Pastry;
}(MenuItem));
var Cafe = /** @class */ (function () {
    function Cafe() {
    }
    Cafe.sell = function (item) {
        item.display();
        Cafe.totalItemsSold++;
    };
    Cafe.totalItemsSold = 0;
    return Cafe;
}());
// Demo
var croissant = new Pastry("Croissant", "Butter");
Cafe.sell(croissant);
console.log("Total sold:", Cafe.totalItemsSold);
