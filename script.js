document.getElementById('submit-decision').addEventListener('click', function() {
    const decision = document.getElementById('decision-menu').value;
    document.getElementById('events-text').innerText = `You chose: ${decision}`;
});

document.getElementById('new-life').addEventListener('click', function() {
    document.getElementById('status-text').innerText = 'Name: Alex\nAge: 0\nEducation: None\nCareer: None\nRelationship Status: Single\nFinancial Status: $0\nHappiness: 50\nHealth: Healthy';
    document.getElementById('events-text').innerText = 'Year 1: Another year has passed.';
});
