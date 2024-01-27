class Solution:
    def countPrimes(self, n: int) -> int:
        list = []
        work = [0]
        # L0204(n, list, work, "up_to_prime")
        L0204(n, list, work, "sieve_of_eratosthenes")
        return len(list)

    
class L0204:
    def __init__(
        self, n: "int", prime_number_list: "list", work: "list of size 1", alg: "string"
    ):
        self._n = n
        self._prime_number_list = (
            prime_number_list  # You need to append this using _append_prime_number
        )
        self._work = work  # You need to increment using _increment_work_done()
        if alg == "up_to_prime":
            self.up_to_primes()
        elif alg == "sieve_of_eratosthenes":
            self.sieve_of_eratosthenes()
        else:
            assert False
            
    def _increment_work_done(self):
        self._work[0] = self._work[0] + 1
    
    def _append_prime_number(self, p):
        self._prime_number_list.append(p)
    
    ##Required function to implement
    def up_to_primes(self) -> "None":
        ## NOTHING CAN BE CHANGED HERE
        ## you cannot call log from Python library
        self._up_to_primes()

    ##Required function to implement
    def sieve_of_eratosthenes(self) -> "None":
        ## NOTHING CAN BE CHANGED HERE
        ## YOU CANNOT CALL math.log from Python library
        self._sieve_of_eratosthenes()
        
    #up to prime Method
    
    def _is_divisible_by_prime(self, n: "int", p: "list") -> "bool":
        i = 0
        while (p[i] * p[i]) <= n:
            self._increment_work_done()
            if n % p[i] == 0:
                return True
            i = i + 1
        return False
    
    def _up_to_primes(self):
        if (self._n < 3):
            return
        self._append_prime_number(2)
        k = self._n
        for i in range(3, k ,2):
            p = self._is_divisible_by_prime(i, self._prime_number_list)
            if p == False:
                self._append_prime_number(i)

    #T: O(n); S: O(n)
#sieve_of_eratosthenes
                
    def sieve_of_eratosthenes(self):
        if(self._n < 2):
            return
        l = [True] * self._n
        l[0] = False
        l[1] = False
        i = 2
        while (i * i) <= self._n:
            if l[i] == True:
                j = i
                while (i * j) < (self._n):
                    self._increment_work_done()
                    l[i * j] = False
                    j = j + 1
            i = i + 1
            
        for i in range(self._n):
            self._increment_work_done()
            if l[i] == True:
               self._append_prime_number(i) 
            
#     def _grow(self):
#         os = self._capacity
#         ns = os * 2
#         print("Grow from", os, "to", ns, ". This is not O(1)")
#         b = self._allocate(ns)
        
#         for k in range(os):
#             b[k] = self._a[k]
#         self._a = b
#         self._capacity = ns


#T: O(1); S: O(n)
    
    def append(self,item):
        if(self._k == self._capacity):
            self._grow()
        self._a[self._k] = item
        self._k = self._k + 1
    