let a=[1,5,7,8,9,4,6]
let b=[1,5,9] 
let isSubset = true
for(let i=0;i<b.length;i++){
    let gotValue = false
    for(let j=0;j<a.length;j++){
     if(b[i] == a[j]) 
     gotValue = true;
    }
    if(gotValue == false)  {
        isSubset = false
        break
    }
}// i

if(isSubset == true) console.log("Yes it is Sub Set")
else console.log("No it is  Not Sub Set")