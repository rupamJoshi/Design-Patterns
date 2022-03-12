package main

import "errors"

func getGun(gunType string) (iGun, error) {

	if gunType == "ak47" {
		return newAK47(), nil
	}

	if gunType == "musket" {
		return newMusket(), nil
	}

	return nil, errors.New("fuck sake")
}
