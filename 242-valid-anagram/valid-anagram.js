/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    if(s.length!=t.length) return false;
    let ch1=s.split('');
    let ch2=t.split('');
    ch1.sort();
    ch2.sort();
    for(let i=0;i<ch1.length;i++){
        if(ch1[i]!=ch2[i]) return false;
    }
    return true;
};