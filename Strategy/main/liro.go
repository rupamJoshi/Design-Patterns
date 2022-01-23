package main

import (
	"fmt"
)

type liro struct {
}

func (l *liro) evict(c *cache) {
	fmt.Println("Evicting by lifo stratgy")
}
