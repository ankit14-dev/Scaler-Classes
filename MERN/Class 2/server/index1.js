const express = require('express');
const app = express();

const courses = [
    { id: 1, name: 'Course 1' },
    { id: 2, name: 'Course 2' },
    { id: 3, name: 'Course 3' },
];

const port = 5000;
app.get('/',(req, res) => {
    res.send('Hello from Class2 server!');
});
app.get('/courses', (req, res) => {
    res.send(courses);
});
app.get('/courses/:id', (req, res) => { 
    const courseId = parseInt(req.params.id, 10);
    const course = courses.find(c => c.id === courseId);
    if (course) {
        res.send(course);
    } else {
        res.status(404).send({ message: 'Course not found' });
    }
});

app.listen(port, () => {
    console.log(`Class2 server is running on http://localhost:${port}`);
});