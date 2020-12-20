package main

import (
	"fmt"
	"time"
)

func main() {
	c := make(chan string)
	go slowFunc(c)
	fmt.Println("就pa的一下，很快的，我当时还没有反映过来")
	msg := <-c
	fmt.Println(msg)
}
func slowFunc(c chan string) {
	time.Sleep(time.Second * 9)
	c <- "slowFunc() Finished | 原来这就是go语言的管道通信"
}
