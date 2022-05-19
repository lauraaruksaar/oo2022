
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import { Container, Paper, Button } from '@material-ui/core';
import React, { useEffect, useState } from 'react';
import { SelectUnstyledContext } from '@mui/base';

export default function Animal() {
    const paperStyle={padding: '50px 20px', width:600,margin:"20px auto"}
    const[name,setName]=useState('')
    const[code, setCode]=useState('')
    const[animals,setAnimals]=useState([])

    const handleClick=(e)=>{
        e.preventDefault()
        const animal={name,code}
        console.log(animal)
        fetch("http://localhost:8080/animal/add",{
            method:"POST",
            headers:{"Content-Type":"application/json"},
            body:JSON.stringify(animal)
        }).then(()=>{
            console.log("New animal added")
        })
    }
    useEffect(()=>{
        fetch("http://localhost:8080/animal/getAll")
        .then(res=>res.json())
        .then((result)=>{
            setAnimals(result);
        }
    )},[])
  return (

    <Container>
        <Paper elevation={3} style={paperStyle}>
            <h1>Lisa looma andmed</h1>
    <Box component="form" sx={{'& > :not(style)': { m: 1, }}} noValidate autoComplete="off">
        <TextField id="standard-basic" label="Looma nimi" variant="standard" fullWidth
            value={name}
            onChange={(e)=>setName(e.target.value)}
        />
        <TextField id="standard-basic" label="Kiibi kood" variant="standard" fullWidth 
            value={code}
            onChange={(e)=>setCode(e.target.value)}
        />
        <Button variant="outlined" onClick={handleClick}>Salvesta</Button>
    </Box>
    </Paper>
    <h1>Loomad</h1>
    <Paper elevation={3} style={paperStyle}>
        {animals.map(animal=>(
            <Paper elevation={6} style={{margin:"10px", padding:"15px", textAlign:"left"}} key={SelectUnstyledContext.id}>
            Id: {animal.id}<br/>
            Nimi: {animal.name}<br/>
            Kiibi kood: {animal.code}
            </Paper>
        )
        )}
    </Paper>
    </Container>
  );
}
