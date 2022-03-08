package main

type subject interface {
	register(Observer observer)
	unregister(Observer observer)
	notifyAll()
}
