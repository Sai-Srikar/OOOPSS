import React from 'react';
import Avatar from '@material-ui/core/Avatar';
import Button from '@material-ui/core/Button';
import CssBaseline from '@material-ui/core/CssBaseline';
import TextField from '@material-ui/core/TextField';
import FormControlLabel from '@material-ui/core/FormControlLabel';
import Checkbox from '@material-ui/core/Checkbox';
import Link from '@material-ui/core/Link';
import IconButton from '@material-ui/core/IconButton';
import Paper from '@material-ui/core/Paper';
import Table from '@material-ui/core/Table';
import TableBody from '@material-ui/core/TableBody';
import TableCell from '@material-ui/core/TableCell';
import TableContainer from '@material-ui/core/TableContainer';
import RemoveIcon from '@material-ui/icons/Remove';
import TableHead from '@material-ui/core/TableHead';
import TableRow from '@material-ui/core/TableRow';
import Box from '@material-ui/core/Box';
import Grid from '@material-ui/core/Grid';
import LockOutlinedIcon from '@material-ui/icons/LockOutlined';
import Typography from '@material-ui/core/Typography';
import MoreVertIcon from '@material-ui/icons/MoreVert';
import FavoriteIcon from '@material-ui/icons/Favorite';
import ShareIcon from '@material-ui/icons/Share';
import { makeStyles } from '@material-ui/core/styles';
import logo from '../../resources/food.jpg';
import Restaurant from '../../Components/Restaurant/restaurant';
import {usePosition} from '../location/usePosition';
import Card from '@material-ui/core/Card';
import CardHeader from '@material-ui/core/CardHeader';
import CardMedia from '@material-ui/core/CardMedia';
import AddIcon from '@material-ui/icons/Add';
import CardContent from '@material-ui/core/CardContent';
import CardActions from '@material-ui/core/CardActions';
import ThumbUpAltIcon from '@material-ui/icons/ThumbUpAlt';

const useStyles = makeStyles((theme) => ({
  root: {
    height: '100vh',
  },
  ttt:{
    paddingTop:theme.spacing(2),
    paddingBottom:theme.spacing(2),
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
    margin: theme.spacing(1),
    backgroundColor: theme.palette.secondary.main,
  },
  form: {
    width: '100%', 
    marginTop: theme.spacing(1),
  },
  submit: {
    margin: theme.spacing(3, 0, 2),
  },
}));

export default function RestaurantLayout() {

  function createData(name, calories, fat, carbs, protein) {
  return { name, calories, fat, carbs, protein };
}

const rows = [
  createData('Frozen yoghurt', 159, 6.0, 24, 4.0),
  createData('Ice cream sandwich', 237, 9.0, 37, 4.3),
  createData('Eclair', 262, 16.0, 24, 6.0),
  createData('Cupcake', 305, 3.7, 67, 4.3),
  createData('Gingerbread', 356, 16.0, 49, 3.9),
];

  const { latitude, longitude, timestamp, accuracy, error } = usePosition(true);
  console.log(latitude);
  const classes = useStyles();

  return (
    <Grid container style={{padding:'0',margin:'0'}} >
      <Grid xs={12} className={classes.ttt}>
      <Card >
      <CardHeader
        action={
          <IconButton aria-label="settings">
            <MoreVertIcon />
          </IconButton>
        }
        title="Dominos"
        subheader="pizzas"
        style={{paddingBottom:0,backgroundColor:'darkGrey'}}
      />
      <CardContent style={{paddingTop:0,backgroundColor:'darkGrey'}}>
        <Typography variant="body2" color="textSecondary" component="p">
          MiniBypass Road Nellore
        </Typography>
      </CardContent>
      <CardActions>
      <Button
        variant="contained"
        disabled
        className={classes.button}
        startIcon={<ThumbUpAltIcon />}
      >
        25
      </Button>
      <Button
        variant="contained"
        disabled
        className={classes.button}
      >
        Delivery Time:30 min
      </Button>


      <Button
        variant="contained"
        disabled
        className={classes.button}
      >
        Cost for Two:300
      </Button>

      <Button
        variant="contained"
        className={classes.button}
        startIcon={<FavoriteIcon />}
      >
        Favorite
      </Button>
      </CardActions>
    </Card>
      </Grid> 

      <Grid xs={12} className={classes.ttt}>
      <TableContainer component={Paper}>
      <Table className={classes.table} aria-label="simple table">
        <TableHead style={{backgroundColor:"grey"}}>
          <TableRow>
            <TableCell >ITEM</TableCell>
            <TableCell align="right">PRICE</TableCell>
            <TableCell align="right">QUANTITY</TableCell>
          </TableRow>
        </TableHead>
        <TableBody>
          {rows.map((row) => (
            <TableRow key={row.name}>
              <TableCell component="th" scope="row">
                {row.name}
              </TableCell>
              <TableCell align="right">{row.calories}</TableCell>
              <TableCell align="right"><IconButton><RemoveIcon /></IconButton>{row.fat}<IconButton><AddIcon /></IconButton></TableCell>
            </TableRow>
          ))}
        </TableBody>
      </Table>
    </TableContainer>
      </Grid>
    </Grid>
  );  
}