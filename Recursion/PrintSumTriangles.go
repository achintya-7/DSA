package main

import "fmt"

func main() {
	arr := []int{1, 2, 3, 4}
	printTriangle(arr)
}

func printTriangle(arr []int) {
	if len(arr) < 1 {
		return
	}

	temp := make([]int, len(arr)-1)
	for i := 0; i < len(arr)-1; i++ {
		temp[i] = arr[i] + arr[i+1]
	}

	// gotta print the last recursion call first so call the function again
	printTriangle(temp)

	// now print it first when the last call is complete 
	fmt.Println(arr)

}