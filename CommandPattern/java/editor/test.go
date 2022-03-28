package main

import (
	"fmt"
)

type testNum struct {
	a int
	b int
}

func test1() {
	fmt.Println("in Test1")
}

func test2() {
	fmt.Println("in Test2")
}
func swap(a int, b int, c chan testNum) {
	
	a, b = b, a
	fmt.Println("a=", a, "b=", b)
	t := testNum{
		a: a,
		b: b,
	}
	c <- t
}

type vehicle interface {
    getName()
	getSpeed()
}

func numberWheels( v vehicle ) int {
	return 4
}



func test4() {

}

func main() {
	fmt.Println("Hello")
	defer test1()
	defer test2()
	a := 2
	b := 4
	c := make(chan testNum)
	go swap(a, b, c)
	go swap(a, b, c)
	t := <-c
	fmt.Println("a=", t.a, "b=", t.b)
	fmt.Println("Bye")
}
