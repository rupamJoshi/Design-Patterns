package main

import (
	"fmt"
)

type lifo struct {
}

func (l *lifo) evict(c *cache) {
	fmt.Println("Evicting by lifo stratgy")
}
