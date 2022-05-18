
import { useRef } from "react";

function Add() {
    const nameRef = useRef();
    const stdntcodeRef = useRef();
   

    function addStudent() {
        fetch("http://localhost:8080/students", {
            method: "POST",
            body: JSON.stringify({
                name: nameRef.current.value, 
                stdntcode: stdntcodeRef.current.value
            }),
            headers: {
                "Content-Type": "application/json"
            }
        });
    }

    return (<div>
        <label htmlFor="">NIMI</label>
        <input ref={nameRef} type="text" />
        <label htmlFor="">ÜLIÕPILASKOOD</label>
        <input ref={stdntcodeRef} type="stdntcode" />
        <button onClick={() => addStudent()}>Lisa</button>
    </div>)
}

export default Add;