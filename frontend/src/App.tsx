import React, { useState } from 'react';
import { motion } from 'framer-motion';

const App = () => {
  const [workflowData, setWorkflowData] = useState('');

  const handleCreateWorkflow = async () => {
    const response = await fetch('/api/workflows', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify({ data: workflowData })
    });
    const result = await response.text();
    alert(result);
  };

  return (
    <div className="container mx-auto px-4 py-8">
      <h1 className="text-3xl font-bold text-center mb-8">AI Approval Workflows</h1>
      <motion.div initial={{ opacity: 0 }} animate={{ opacity: 1 }} transition={{ duration: 1 }}>
        <input
          type="text"
          placeholder="Enter workflow data"
          value={workflowData}
          onChange={(e) => setWorkflowData(e.target.value)}
          className="border rounded p-2 mb-4 w-full"
        />
        <button onClick={handleCreateWorkflow} className="bg-blue-500 text-white p-2 rounded">Create Workflow</button>
      </motion.div>
    </div>
  );
};

export default App;