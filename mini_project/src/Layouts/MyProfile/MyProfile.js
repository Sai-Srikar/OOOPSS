import React from 'react';
import Avatar from '@material-ui/core/Avatar';
import Grid from '@material-ui/core/Grid';
import axios from 'axios';
import Typography from '@material-ui/core/Typography';
import { makeStyles } from '@material-ui/core/styles';
import UserInfo from '../../Components/MyProfile/UserInfo';
import Addresses from '../../Components/MyProfile/Addresses';

const useStyles = makeStyles((theme) => ({
  root: {
    height: '100vh',
  },
  container:{
    padding:theme.spacing(1),
  },
  paper: {
    margin: theme.spacing(8, 4),
    display: 'flex',
    flexDirection: 'column',
    alignItems: 'center',
  },
  
}));

export default function MyProfile() {
  const classes = useStyles();
  const [userProfile,setUserProfile]=React.useState({});
React.useEffect(() => {
     axios.get(`http://localhost:8083/gateway/restaurant/all`)
      .then(res => {
        setUserProfile(res.data);
      })
  }, []);
  return (
    <Grid container >
      <Grid item xs={12} md={5}>
      <UserInfo />
      </Grid>

      <Grid xs={12} md={7} className={classes.container} >
      <Addresses />
      </Grid>
    </Grid>
  );
}