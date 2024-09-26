function isPalindrome(str) {
  // Write your code here
  // return the result

  let strNew=str.split(" ").join("");
  strNew=strNew.split(",").join("");
  strNew=strNew.split("!").join("");
  const strRev = str.split("").reverse().join("");
  const strRev1 = strRev.split("!").join("");
  let strRev2 = strRev1.split(",").join("");
  strRev2 = strRev2.split(" ").join("");
  if (strRev2.toLowerCase() == strNew.toLowerCase()) {

    return true;
  } else {
    return false;
  }
}

console.log(isPalindrome("A man, a plan, a canal, Panama!"));
