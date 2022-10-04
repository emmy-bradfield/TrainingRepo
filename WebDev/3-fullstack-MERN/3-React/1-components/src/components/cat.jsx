const Cat = () => {

    const cat = {
        name: "Poppy",
        breed: "Tortoiseshell",
        age: 13,
        cuteness: "100%"
    }

    return (
        <div className="cat">
            <h5> Cat Time! </h5>
            <h5>{cat.name} is a {cat.age}-year-old {cat.breed}</h5>
            <h5>Cuteness Rating: {cat.cuteness}</h5>
        </div>
    );

}

export default Cat;