package main

import (
	"fmt"
	"time"
)

func main() {
	go slowFunc() //GOroutine
	fmt.Println("i am not shown until slowFunc() completes")
	time.Sleep(time.Second * 10)
}
func slowFunc() {
	time.Sleep(time.Second * 9)
	fmt.Println("Sleeper() finished")
}
