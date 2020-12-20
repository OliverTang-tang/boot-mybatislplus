package main

import (
	"fmt"
	"time"
)

func main() {
	msg := make(chan string, 2)
	msg <- "hello"
	msg <- "world"
	close(msg) //关闭 通道，禁止在发送信息给通道。
	fmt.Println("pushed two messages onto channel with no receivers")
	time.Sleep(time.Second * 9)
	receiver(msg)
}
func receiver(c chan string) {
	for msg := range c {
		fmt.Println(msg)
	}
}
