package main

import "fmt"

func main() {
	shirtItem := newItem("Nike Shirt")

	observerFirst := &customer{id: "abc@gmail.com"}
	observerSecond := &customer{id: "xyz@gmail.com"}
	observerThird := &customer{id: "tyy@gmail.com"}

	shirtItem.register(observerFirst)
	shirtItem.register(observerSecond)
	shirtItem.register(observerThird)

	shirtItem.updateAvailability()

	fmt.Println("UnRegistering first observer")
	shirtItem.unregister(observerFirst)

	shirtItem.updateAvailability()

}
