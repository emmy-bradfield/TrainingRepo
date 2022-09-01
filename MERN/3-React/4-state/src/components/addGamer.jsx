const AddGamers = ({ submitHandler, newPlayer, handleAdd, handleClear }) => {
    return (
        <form className="slide" onSubmit={submitHandler}>
            <input id="in" className="form-control" placeholder="Enter name:" type="text" onChange={newPlayer} />
            <button id="add" className="btn btn-dark" type="button" onClick={handleAdd} >
                ADD
            </button>
            <button className="btn btn-dark" type="button" onClick={handleClear}>
                CLEAR
            </button>
        </form>
    );
}

export default AddGamers;