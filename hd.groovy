def dis = 0;
def current_str = doc.hash.value;
def t_len = target_str.size();
def c_len = current_str.size();
if (t_len != c_len) {
    return false;
}
for (i = 0; i < c_len; i++) {
    if (current_str[i] != target_str[i]) {
        dis++;
    };
    if(c_len-(i+1) +dis <= threshold){
        return true;
    }
    if (dis > threshold) {
        return false;
    }
};
return true;