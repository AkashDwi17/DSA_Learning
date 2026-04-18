public static void removeCycle() {
    Node slow = head;
    Node fast = head;
    boolean isCycle = false;

    // Step 1: Detect cycle
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) {
            isCycle = true;
            break;
        }
    }

    if (!isCycle) {
        System.out.println("No Cycle!");
        return;
    }

    // Step 2: Find start of cycle
    slow = head;
    while (slow != fast) {
        slow = slow.next;
        fast = fast.next;
    }

    // Step 3: Remove cycle
    Node start = slow;
    Node temp = start;
    while (temp.next != start) {
        temp = temp.next;
    }
    temp.next = null;
}
