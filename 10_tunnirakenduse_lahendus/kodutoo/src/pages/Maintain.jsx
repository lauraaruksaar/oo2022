import { useEffect, useState } from "react";

function Maintain() {
    const [students,setStudents] = useState([]); // Reacti erikood -> 
                                                //muutuja (HTMLi), funktsioon (HTMLi uuendamiseks), algväärtus (tühi massiiv)
    useEffect(()=>{ 
    fetch("http://localhost:8080/students")
    .then(response => response.json())
    .then(body => setStudents(body));
    },[]);
   
    function deleteStudent(studentId) {
        fetch("http://localhost:8080/students/" + studentId, {
            method: "DELETE"
        }).then(response => response.json())
        .then(body => setStudents(body));

    }


    return (
        students.map( element =>
             <div>
                 <img src={element.imgSrc} alt="" />
                 <div>{element.name}</div>
                 <div>{element.stdntcode}</div>
                 <div>{element.id}</div>
                 <div>{element.active}</div>
                 <div>{element.description}</div>
                 <button onClick={() => deleteStudent(element.id)}>X</button>
            </div>)
    )
}

export default Maintain;