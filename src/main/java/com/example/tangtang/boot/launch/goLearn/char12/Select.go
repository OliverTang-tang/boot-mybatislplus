package main

import (
	"fmt"
	"time"
)

func main() {
	channel1 := make(chan string)
	channel2 := make(chan string)

	go ping1(channel1)
	go ping2(channel2)

	select {
	case msg1 := <-channel1:
		fmt.Println("received", msg1)
	case msg2 := <-channel2:
		fmt.Println("received", msg2)
	}
}

func ping1(c chan string) {
	time.Sleep(time.Second * 5)
	c <- "ping on channel1"
}

func ping2(c chan string) {
	time.Sleep(time.Second * 4)
	c <- "ping on channel2"
}
