package main

type Espresso struct {
}

func (p *Espresso) getCost() int64 {
	return 1
}

func (p *Espresso) getDescription() string {
	return "Espresso"
}
