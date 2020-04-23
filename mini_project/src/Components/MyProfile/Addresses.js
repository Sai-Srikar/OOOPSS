import React from 'react';
import Button from '@material-ui/core/Button';
import Grid from '@material-ui/core/Grid';
import Typography from '@material-ui/core/Typography';
import { makeStyles } from '@material-ui/core/styles';
import Paper from '@material-ui/core/Paper';
import WorkOutlineOutlinedIcon from '@material-ui/icons/WorkOutlineOutlined';
import HomeOutlinedIcon from '@material-ui/icons/HomeOutlined';
import EditIcon from '@material-ui/icons/Edit';
import LocationOnOutlinedIcon from '@material-ui/icons/LocationOnOutlined';
import Card from '@material-ui/core/Card';
import CardHeader from '@material-ui/core/CardHeader';
import CardMedia from '@material-ui/core/CardMedia';
import CardContent from '@material-ui/core/CardContent';
import CardActions from '@material-ui/core/CardActions';
import Avatar from '@material-ui/core/Avatar';
import IconButton from '@material-ui/core/IconButton';
import FavoriteIcon from '@material-ui/icons/Favorite';
import ShareIcon from '@material-ui/icons/Share';
import MoreVertIcon from '@material-ui/icons/MoreVert';
import {add} from '../../Layouts/data/address.js';

const useStyles = makeStyles((theme) => ({
  root: {
    height: '100vh',
  },
  tte:{
    padding:theme.spacing(1),
  },
  image: {
    backgroundRepeat: 'no-repeat',
    backgroundColor:
      theme.palette.type === 'light' ? theme.palette.grey[50] : theme.palette.grey[900],
    backgroundSize: 'cover',
    backgroundPosition: 'center',
  },
  paper: {
    margin: theme.spacing(8, 4),
    display: 'flex',
    flexDirection: 'column',
    alignItems: 'center',
  },
  avatar: {
    backgroundColor: theme.palette.secondary.main,
  },
  form: {
    width: '100%', // Fix IE 11 issue.
    marginTop: theme.spacing(1),
  },
  submit: {
    margin: theme.spacing(3, 0, 2),
  },
}));

export default function Addresses() {
  const classes = useStyles();

  return (
    <Grid container>
    <Grid xs={12}>
    <Typography>Manage Addresses</Typography>
    </Grid>
    {add.map((order) => (
      <Grid xs={12} md={6} className={classes.tte}>
        <Card >
      <CardHeader
        avatar={
          <Avatar aria-label="recipe" className={classes.avatar}>
            <HomeOutlinedIcon />
          </Avatar>
        }
        action={
          <IconButton aria-label="settings">
            <EditIcon />
          </IconButton>
        }
        title={order.name}
      />
      <CardContent>
        <Typography variant="body2" color="textSecondary" component="p">
          {order.no}
        </Typography>
      </CardContent>
    </Card>
      </Grid>))}
    </Grid>
  );
}