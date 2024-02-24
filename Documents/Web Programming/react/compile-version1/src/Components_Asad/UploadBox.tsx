import React, { useCallback } from 'react';
import { useDropzone } from 'react-dropzone';
import axios from 'axios';

const UploadBox = () => {
  const onDrop = useCallback((acceptedFiles: File[]) => {
    const file = acceptedFiles[0];
    const formData = new FormData();
    formData.append('file', file);

    axios.post('YOUR_UPLOAD_API_ENDPOINT', formData, {
      headers: {
        'Content-Type': 'multipart/form-data',
      },
    })
    .then((response) => {
      console.log(response.data);
      // Handle successful upload, e.g., show a success message
    })
    .catch((error) => {
      console.error(error);
      // Handle error, e.g., show an error message
    });
  }, []);

const { getRootProps, getInputProps } = useDropzone({
    onDrop,
    'accept': {
        'video/mp4': ['.mp4', '.MP4'],
    }, 
    maxFiles: 1,
});

  return (
    <div>
      <div {...getRootProps()} style={dropzoneStyles}>
        <input {...getInputProps()} />
        <p>Drag 'n' drop a video file here, or click to select one</p>
      </div>
    </div>
  );
};

const dropzoneStyles: React.CSSProperties = {
  border: '2px dashed #ccc',
  borderRadius: '4px',
  padding: '20px',
  textAlign: 'center',
  cursor: 'pointer',
};

export default UploadBox;