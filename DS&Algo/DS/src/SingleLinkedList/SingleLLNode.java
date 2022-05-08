package SingleLinkedList;

public class SingleLLNode {

        private Integer data;
        private SingleLLNode next;

        public SingleLLNode(Integer data, SingleLLNode o) {
            this.data = data;
            this.next = o;
        }

        public Integer getData() {
            return data;
        }

        public void setData(Integer data) {
            this.data = data;
        }

        public SingleLLNode getNext() {
            return next;
        }

        public void setNext(SingleLLNode next) {
            this.next = next;
        }

}
