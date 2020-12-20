package main

import (
	"fmt"
	"time"
)

func main() {
	message := make(chan string)
	go pinger(message)
	msg := <-message
	for i := 0; i < 5; i++ {
		fmt.Println(msg)
	}

}
func pinger(c chan string) {
	t := time.NewTicker(3 * time.Second)
	for {
		c <- "ping"
		<-t.C
	}
}
