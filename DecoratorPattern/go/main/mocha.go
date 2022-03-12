package main

type Mocha struct {
	beverage Beverage
}

func (p *Mocha) getCost() int64 {
	return p.beverage.getCost() + 1
}

func (p *Mocha) getDescription() string {
	return p.beverage.getDescription() + "Mocha"
}
