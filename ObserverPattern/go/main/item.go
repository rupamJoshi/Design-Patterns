package main

import "fmt"

type item struct {
	observerList []observer
	name         string
	inStock      bool
}

func newItem(name string) *item {
	return &item{
		name: name,
	}
}

func (i *item) updateAvailability() {
	fmt.Printf("Item %s is now in stock\n", i.name)
	i.inStock = true
	i.notifyAll()
}

func (i *item) notifyAll() {
	for _, observer := range i.observerList {
		observer.update(i.name)
	}
}

func (i *item) register(o observer) {
	i.observerList = append(i.observerList, o)
}

func (i *item) unregister(o observer) {
	i.observerList = removeFromslice(i.observerList, o)
}

func removeFromslice(observerList []observer, observerToRemove observer) []observer {
	observerListLength := len(observerList)
	for i, observer := range observerList {
		if observerToRemove.getID() == observer.getID() {
			observerList[i] = observerList[observerListLength-1]
			fmt.Println(observerList[observerListLength-1].getID(), observerList[i].getID())
			return observerList[:observerListLength-1]
		}
	}
	return observerList
}
