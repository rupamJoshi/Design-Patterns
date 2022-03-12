package main

import "fmt"

func main() {

	beverage := &Espresso{}

	fmt.Println(beverage.getCost())
	fmt.Println(beverage.getDescription())

	withAddOn := &Mocha{
		beverage: beverage,
	}

	fmt.Println(withAddOn.getCost())
	fmt.Println(withAddOn.getDescription())

}
