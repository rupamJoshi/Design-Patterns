package main

type Beverage interface {
	getCost() int64
	getDescription() string
}
