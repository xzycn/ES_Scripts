def ok():
    hash1 = '1234567qazxsdcvf'
    hash2 = '1234567iazxsdevf'
    ham_dis = 0
    for ch1, ch2 in zip(hash1, hash2):
        if ham_dis >= 5:
            return False
        if ch1 != ch2:
            ham_dis += 1
    return True