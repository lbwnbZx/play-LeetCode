class Solution:
    def getLeastNumbers(self, arr: List[int], k: int) -> List[int]:
        def partition(arr, l, r):
            #选定中值
            pivotvalue = arr[l]
            lmark = l + 1
            rmark = r
            done = False

            while not done:
                while lmark <= rmark and arr[lmark] <= pivotvalue:
                    lmark += 1
                while rmark >= lmark and arr[rmark] >= pivotvalue:
                    rmark -= 1
                if rmark < lmark:
                    done = True
                else:
                    arr[lmark], arr[rmark] = arr[rmark], arr[lmark]

            arr[l], arr[rmark] = arr[rmark], arr[l]
            return rmark
        
        def quicksort(arr, l, r, k):
            if l > r:
                return 
            pos = partition(arr, l, r)
            num = pos - l + 1
            if k == num:
                return
            if k < num:
                quicksort(arr, l, pos - 1, k)
            else:
                quicksort(arr, pos+1, r, k - num)

        if k == 0:
            return []
        quicksort(arr, 0, len(arr) - 1, k)
        return arr[:k]
