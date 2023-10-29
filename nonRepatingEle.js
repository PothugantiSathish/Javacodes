// Given an array of integers of size N, the task is to find the first non-repeating element in this array. 

// Examples:

// Input: {-1, 2, -1, 3, 0}
// Output: 2
// Explanation: The first number that does not repeat is : 2

// Input: {9, 4, 9, 6, 7, 4}
// Output: 6


// let input=[-1,2,-1,3,0]
// for(let i=0;i<input.length;i++){
//     let isRepeating=false;
//     for(let j=i+1;j<input.length;j++){
//         if(input[i]==input[j]){
//         isRepeating=true;
//         break;
//     }
// }
//     if(isRepeating==false){
//     console.log(input[i]);
//     break;
// }
// }


let num =[9, 4, 9, 6, 7, 4]//2 
// 6
let dup =[]// dup[0] =9 ,,dup[1]=4
for(let i=0;i<num.length;i++){
    dup[i] = num[i]
    let count=0
    let isPrev = false
    // check previos number list
    for(let k=0;k<i;k++){
        if(num[i] == num[k]) isPrev = true
    }
    if(isPrev == false){
        for(let j=i+1;j<num.length;j++){
            if(num[i] == num[j]) {
                count++
                break
            }// if
        }// j
        if(count == 0) {
            console.log("res--->"+num[i])
            break
        }
    }
    
}// i
console.log("ends")