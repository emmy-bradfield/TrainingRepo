const Meal = props => {
    return(
        <>
        <h4> {props.bp} </h4>
        <em> {props.bakepot} </em>
        <h4> {props.bpc} </h4>
        <em> {props.bakepotcheese} </em>
        <h4> {props.bpcb} </h4>
        <em> {props.bakepotbeans} </em>
        <h4> {props.sb}</h4>
        <em> {props.spagbol} </em>
        </>
    );
}

const Menu = () => {
    return(
        <div className="stack">
            <Meal bp = "Baked Potato"/>
            <Meal bakepot="Microwave one medium sized potato for 10 minutes, then bake in the oven for a further 20. When
            sufficiently soft inside, remove from the oven, make a thin slice longways, and add a single knob of butter." />

            <Meal bpc = "Baked Potato with Cheese"/>
            <Meal bakepot="Microwave one medium sized potato for 10 minutes, then bake in the oven for a further 20. When
            sufficiently soft inside, remove from the oven, make a thin slice longways, and add a single knob of butter." />
            <Meal bakepotcheese="Finally, grate some cheddar cheese over the baked potato." />

            <Meal bpcb = "Baked Potato with Cheese and Beans"/>
            <Meal bakepot="Microwave one medium sized potato for 10 minutes, then bake in the oven for a further 20. When
            sufficiently soft inside, remove from the oven, make a thin slice longways, and add a single knob of butter." />
            <Meal bakepotbeans="Microwave half a tin of beans for around 2 minutes, then pour over the baked potato." />
            <Meal bakepotcheese="Finally, grate some cheddar cheese over the baked potato." />
            
            <Meal sb = "Spaghette Bolognaise"/>
            <Meal spagbol="Cook down some onions, garlic, quorn mince, halved cherry tomatoes, spinach, and any other chosen
            veg for around 5 minutes, or until soft. Meanwhile, boil a small handful of spaghetti in a pan with a little salt 
            until tender to preference. Add a tin of chopped tomatoes and some vegetable stock to the mine and veg, and leave 
            to reduce for around 10 minutes. Finally, serve the bolognaise over the spaghettit with a small sprinkle of cheese 
            on top." />

        </div>
    );
}

export default Menu;