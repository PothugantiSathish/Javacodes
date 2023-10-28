function findLength(num){
    let len=0
    while(num != 0){
        num = num /10;
        num=num | 0
        len++
    }
    return len
}
let n=8671
let m=1768
let nLen = findLength(n)
let mLen = findLength(m)
if(nLen == mLen){
    let nArr = [0,0,0,0,0,0,0,0,0,0]// 0--9
    let mArr = [0,0,0,0,0,0,0,0,0,0]// 0--9
    let nr,mr
    
    while(n != 0){
        nr = n % 10;
        mr= m % 10
        n = n / 10;
        n = n | 0;
        m = m / 10
        m = m | 0
        nArr[nr]++
        mArr[mr]++
    }
    let isAnagram = true
    for(let i =0;i<=9;i++){
        if(nArr[i] != mArr[i]){
            isAnagram = false
            break
        }
    }
    
    if(isAnagram == true) console.log("Both are anagrams")
    else console.log("Not Anagrams")
}
else console.log("Not Anagrams")