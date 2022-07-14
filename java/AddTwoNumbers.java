class Solution {
    
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        
        int carry = 0;
        ListNode resolution = new ListNode(0);
        ListNode currentVariable = resolution;
        
        while(list1 != null || list2 != null || carry != 0) {
            
            if(list1 != null) {
                carry = carry + list1.val;
                list1 = list1.next;
            }
            
            if(list2 != null) {
                carry += list2.val;
                list2 = list2.next;
            }
            
            currentVariable.next = new ListNode(carry % 10);
            currentVariable = currentVariable.next;
            carry /= 10;
        }
        
    return resolution.next;
        
    }
}
