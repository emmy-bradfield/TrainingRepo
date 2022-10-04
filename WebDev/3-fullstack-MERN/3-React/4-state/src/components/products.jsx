import {useState} from 'react';

const items=[
    {id: 1, name: "cheese", cost: 5.25, department: "fresh"},
    {id: 2, name: "dove shampoo", cost: 1.50, department: "health and beauty"},
    {id: 3, name: "spinach, 500g", cost: 1.15, department: "fresh"},
    {id: 4, name: "demi-baguette", cost: 0.90, department: "bakery"},
    {id: 5, name: "vix vaporub", cost: 3.20, department: "health and beauty"}
]

const Products = () =>{
    const[department, setDepartment] = useState("");
    const[products, setProducts] = useState([items]);

    const filter = (e) => {
        const search = e.target.value;

        if (search !== ""){
            const results = items.filter((item) =>{
                return item.department.toLowerCase().startsWith(search.toLowerCase());
            });
            setProducts(results)
        } else {
            setProducts(items);
        }

        setDepartment(search);
    };

    return(
        <div>
            <form>
            <input className="form-control" type="search" value={department} name="search" onChange={filter} placeholder="Search by department"/>
            </form>
            <ul className="stack">
                {products && products.length > 0 ? (
                    products.map((product) => (
                        <li key={product.id}>{product.name} {"(£"}{product.cost}{")"} | {product.department} </li>
                    ))
                ) : (
                    <em> No products found</em>
                )}
            </ul>
        </div>
    );

}

export default Products;