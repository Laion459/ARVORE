public class Tree {
        public Node root = null;
        public int size;

    public Tree() {
        setSize(0);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                ", size=" + size +
                '}';
    }

    /**
     *  Insere elementos na árvore
     * @param element valor inteiro a adicionar na árvore, (chave)
     * @param place Árvore de referência
     */
    public void insert(int element, Node place){
        // se for nulo ele é minha raiz
        if (place == null){
            System.out.print(" " + element);
            root = new Node(element);
            size++;

            // Verifica se é maior ou menor. Se for menor vai pra ezquerda, se for menor a direita//
        } else if (element < place.getElement()) {

            // Se filho for vazio insere novo no
            if (place.getLeft() == null){
                System.out.print(" " + element);
                place.setLeft(new Node(element));
                size++;

                // Se não for vazio ele insere na esquerda / chama isere de novo
            }else {
                insert(element, place.getLeft());
            }

            // Verifica se é maior, se for ele coloca a direita na árvore
        } else if (element > place.getElement()) {

            // verifica se filho é vazio, insere novo nó
            if (place.getRight() == null){
                System.out.print(" " + element);
                place.setRight(new Node(element));
                size++;

                // Se não, insere a direita
            }else {
                insert(element, place.getRight());
            }
        }
    }

    /**
     * Imprime em modo pre ordem, imprime (mostra) primeiro e depois percorre para o próximo
     * @param place árvore a ser mostrada (impresa)
     */
    public void preOrder(Node place){
        // Imprime o valor do nó
        System.out.print(" " + place.getElement());

        // Avança para próximo nó

        // Se nó esquerdo for diferente de nulo recursivamente chama preOrder.(place.getLeft) novamente
        if (place.getLeft() != null){
            preOrder(place.getLeft());
        }

        // Se nó direito for diferente de nulo, chama preOrder.(place.getRight)
        if (place.getRight() != null){
            preOrder(place.getRight());
        }
    }

    /**
     * Imprime em modo em ordem, imprime (mostra) primeiro os elementos da esquerda
     * @param place árvore a ser mostrada (impresa)
     */
    public void inOrder(Node place){
        // Avança para próximo nó

        // Se nó esquerdo for diferente de nulo recursivamente chama preOrder.(place.getLeft) novamente
        if (place.getLeft() != null){
            inOrder(place.getLeft());
        }

        // Imprime o valor do nó
        System.out.print(" " + place.getElement());

        // Se nó direito for diferente de nulo, chama preOrder.(place.getRight)
        if (place.getRight() != null){
            inOrder(place.getRight());
        }
    }

    /**
     * Imprime em modo pós ordem, navega e depois imprime
     * @param place árvore a ser mostrada (impresa)
     */
    public void posOrder(Node place){
        // Avança para próximo nó

        // Se nó esquerdo for diferente de nulo recursivamente chama preOrder.(place.getLeft) novamente
        if (place.getLeft() != null){
            posOrder(place.getLeft());
        }

        // Se nó direito for diferente de nulo, chama preOrder.(place.getRight)
        if (place.getRight() != null){
            posOrder(place.getRight());
        }

        // Imprime o valor do nó
        System.out.print(" " + place.getElement());
    }

}

//procedimento insere (elemento : inteiro; var p : ref)
//início
//se p = nulo então
//aloque (p)
//p.chave  elemento
//p.subArvoreEsquerda  nulo
//p.subArvoreDireita  nulo
//senão
//se elemento < p.chave então
//insere (elemento, p.subArvoreEsquerda)
//senão
//insere (elemento, p.subArvoreDireita)
//fim se
//fim se
//fim




//procedimento retira (elemento : inteiro; var p : ref)
//variável
//q : ref
//procedimento retiraElemento (var r : ref)
//início
//se r.subArvoreDireita ≠ nulo então
//retiraElemento (r.subArvoreDireita)
//senão
//q.chave  r.chave
//q  r
//r  r.subArvoreEsquerda
//fim se
//fim
//início
//se elemento < p.chave então
//retira (elemento, p.subArvoreEsquerda)
//senão
//se elemento > p.chave então
//retira (elemento, p.subArvoreDireita)
//senão
//q  p
//se q.subArvoreDireita = nulo então
//p  q.subArvoreEsquerda
//senão
//se q.subArvoreEsquerda = nulo então
//p  q.subArvoreDireita
//senão
//retiraElemento (q.subArvoreEsquerda)
//fim se
//fim se
//libere (q)
//fim se
//fim se
//fim



//algoritmo arvoreBalanceada
//tipo
//ref = nodo
//nodo = registro
//chave : inteiro
//subArvoreEsquerda,
//subArvoreDireita : ref
//fim registro
//variável
//n : inteiro
//raiz : ref
//função constroiArvoreBalanceada (n : inteiro) : ref
//variável
//p : ref
//elemento, numEsquerda, numDireita : inteiro
//início
//se n = 0 então
//constroiArvoreBalanceada  nulo
//senão
//numEsquerda  n div 2
//numDireita  n – numEsquerda – 1
//leia (elemento)
//aloque (p)
//p.chave  elemento
//p.subArvoreEsquerda  constroiArvoreBalanceada (numEsquerda)
//p.subArvoreDireita  constroiArvoreBalanceada (numDireita)
//constroiArvoreBalanceada  p
//fim se
//fim
//início
//leia (n)
//raiz  constroiArvoreBalanceada (n)
//…
//fim